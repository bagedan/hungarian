    static void f() {
        String s[] = {"", "Ghostbusters","If there's something strange", "Who can you call", "Who you gonna call", "Sleeping in your bed", "You better call", "I think you better call", "And call", "If you're all alone", "If there's something weird", "Running through your head", "When it comes through your door", "An invisible man", "Unless you just want some more", "Louder", "Yeah yeah yeah yeah", "In you neighborhood", "And it don't look good", "I ain't afraid of no ghost", "If you've had a dose of a", "I here it likes the girls", "Freaky ghost baby", "Who can ya call", "Who ya gonna call", "Bustin' makes me feel good", "Don't get caught alone no no", "If you're seeing things", "Pick up the phone", "I can't hear you", "Lemme tell ya something"};

        String l = "010217040110180401001919002711030113050401001919000401092808010019211916002401002022060100302500191900260001001214070100240100240100070100240100292401001501002401002301002401";

        for( int i = 0; i < l.length(); i+=2 ) {
            System.out.println( s[Integer.valueOf( l.substring(i, i+2) )] );
        }
    }