
package main

import (
    "fmt"
    "strings"
    "bytes"
    "io/ioutil"
    "strconv"
    "runtime"
    "regexp"
)

func main() {
    var storyboard string = "goomba piranha 10 80 130 goomba"
                    
    f(storyboard)
}

CODEGOLF_METHOD_PLACEHOLDER


func dummyfuncforincludes(){
    dat, err := ioutil.ReadFile("pear")

    if err != nil {
        panic(err)
    }

    fmt.Println(string(dat))

    var buffer bytes.Buffer
    fmt.Println(buffer.String())

    b, err := strconv.ParseBool("true")
    if err != nil {
        panic(err)
    }

    fmt.Println(strconv.FormatBool(b))

    r := []string{}
    strings.Join(r, "")

    fmt.Println(runtime.Compiler, runtime.GOARCH, runtime.GOOS)
    fmt.Println(strconv.IntSize)

    regexp.QuoteMeta("a")
}


