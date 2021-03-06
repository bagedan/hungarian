
Are you thinking with portals? And turrets?

Good.

*The task*

```f(scene: string)```

Figure out what happens with the lasers and the turrets and the targets and print the result to `STDOUT`.

:one: When all targets are hit by laser, all turrets are happy, so print `:D`
:two: Otherwise print `:(`
:three: Crossing or touching beams of different turrets will explode, so print `:/`


*Rules*

We have turrets shooting lasers to the direction they are facing:
```
< : left
> : right
^ : up
v : down
```

The mirrors `/` and `\` will rotate the beams by 90 degrees. They are reflective on both sides.
```
  @      v
> / <  @ \ @
  @      ^
```
> first turret hits the top target, second hits the bottom  one
> bottom turrets hits the left target, top turret hits the right one

These turrets are V3.0, so they are impervious to lasers and block its way; just like the Companion Cube `#`. Additionally, the targets are blocking the laser too.

And here is where the fun starts: we have portals! They are numbered from `0` to `9` and they come in pairs: 

- lasers go into one of them, and come out of the other one
- portals do not change the direction of the lasers
```
      v

> 9 # 9 @

  #
```
> left turret hits the target, top target hits the bottom Companion Cube

Lasers reaching the edge of the scene will never come back.

The scene will be

- provided as a multi-line string, lines separated by `\n`
- will be rectangular (space padded)
```
scene =
  "      v  \n" +
  "> 9 # 9 @\n" +
  "  #      ";
```


*Example Test-Cases*

> Note: you submission will be tested using a lot more inputs

*1.*

Input
```
      v

> 9 # 9 @

  #
```

Output:
`:D`

*2.*

Input
```
     v
> 9#9 @
```

Output:
`:/`
> beams are crossed

*3.*

Input
```
 vvvv
 \\\\\
 /////
 1234
 4321
/////
\\\\\
 @@@@
```

Output:
`:D`

*4.*

Input
```
> \  @
> \  @
> \  @
```

Output:
`:(`
> top target is not getting lasered, because the bottom turret's beam is redirected into The Nothing
