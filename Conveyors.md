You are the Head of Package Dislocaton Configurator Unit. You and your minions are responsible for setting up the conveyors in the warehouse and ensuring that each package will reach its destination fast and safe.

The demand always changes, so one wrong move, one incorrectly placed conveyor, and packages will get stuck _forever_.

You�re building a machine, which validates the configuration of your warehouse, but right now we are focusing on one subroutine only.


*The task*

```f(scene: string, width: int, height: int)```

You receive the configuration of the conveyors in `scene` and you have to check if a package (with dimensions `width` and `height`)

:one: gets into an infinite loop, so you print `8` to `STDOUT`
:two: it stops eventually, which you indicate by printing `9` to `STDOUT`

Packages are placed to the top left corner of the area (fully covering the conveyors in that corner).

*Rules*

Scene is a top view of your warehouse, describing conveyors (`<>^V`) and buttons (`wWhH`).

Converyors move stuff one row or column according to their direction:
```
^: up
v: down
<: left
>: right
```

Buttons turn on/off conveyors:
```
h: disables all horizontal conveyors
H: enables all horizontal conveyors
w: disables all vertical conveyors
W: enables all vertical conveyors
```

Here is an example warehouse:
```
>v< v   
 v ^ >vv
W> h    
  >>>H  
```

Packages cover a `width x height` area of the warehouse:
```
.---.
|vv<|
|>^^|
'---'
```
> The border is only used for illustration purposes, it does not exist in the simulation


:one: conveyors of the opposite direction cancel each other (in pairs)
:two: when one direction has more remaining conveyor than the other, the package will move in that _direction_
:three: when there is a tie between the different directions, the package will move along the _same axis_ as it was moving before. If this happens at the beginning of the simulation, then assume that the package was moving _right_.
:four: when there are no conveyors under the package (it covers only spaces or is outside of the `scene`, i.e. fallen off the conveyors), it _stops_. There are no walls around the conveyors, just a lot of free space.
See the 3x2 packages below.

_Rule #1_
```
.---. .---. .---. .---.
| v^| |vv^| |>> | |>>>|
|v^v| |^^ | |<<<| | <<|
'---' '---' '---' '---'
```
> Packages will move :arrow_down:, :arrow_up:, :arrow_left:, :arrow_right:


_Rule #2_
```
.---.
|> >|
|vvv|
'---'
```
> Packages will move :arrow_down:, because there is more `v` than `>`

_Rule #3_
```
.---.
|><>|
|v^v|
'---'
```
> There is a tie between :arrow_down: and :arrow_right:. 

- If the package was moving :arrow_left: or :arrow_right:, now it will continue moving :arrow_right:
- If the package was moving :arrow_up: or :arrow_down:, now it will continue moving :arrow_down:


*Buttons*

Buttons are push buttons: if a package is over them, they send their signal (On/Off Horizontal/Vertical) to the central controller. When a signal is sent successfully, that operation will be performed by the controller. (I.e. it disables the horizontal conveyors until an on signal is sent.)

The most signals of a given direction win and they work independently: it's possible to disable both horizontal and vertical conveyors at the same time.

*Input*

As usual, `scene` will be multi-line (`\n` separated) rectangular (space padded) string.
```
scene = 
  "hh>>  \n"+
  "Hw>>  \n"+
  "Wvv   \n"+
  "w v>  "+
```


*Examples and Test-Cases*
> Note: you submission will be tested using a lot more inputs

*1.*
```
.---. .---.
|hHh| |hHh|
|><v| |Www|
'---' '---'
```
> Conveyors disabled: horizontal (and package moves down), all (and package stops)


*2.*
```
.---. .---.
|>v | |v> |
|v w| |> h|
'---' '---'
```
> Packages will move :arrow_right:, :arrow_down: 


*3.*

We have a `3x3` box in this warehouse:
```
hh>>
Hw>>
Wvv>
wvv>
```

```
#1       #2       #3
.---.    .---.    .---.
|hh>|    |Hw>|    |w>>|
|Hw>| => |Wvv| => |vv>|
|Wvv|    |wvv|    |vv>|
'---'    '---'    '---'
```

#1: all horizontal conveyors are disabled, package moves :arrow_down:
#2: `H`>`hh` -> horizontals are enabled, but verticals get disabled, package moves :arrow_right:
#3: package will continue to :arrow_right:

*4.*

Scene
```
>v>v>v
^v^v^v
^v^v^v
^>^>^v
^<<<<<
```

```
w | h | output
2 | 1 | 8
2 | 5 | 9
3 | 2 | 8
6 | 5 | 9
```


*5.*

Input: `2x3`
```
>vhv>v
^v>v^v
^vHvwW
^>^>>v
^<<<<<
```

Output: `8`
