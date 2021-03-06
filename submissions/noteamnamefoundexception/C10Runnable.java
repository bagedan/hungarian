package hu.epam.hackaton.noteamfoundexception.theApplication;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class C10Runnable {

    static void f(int n, String p) {
        PrintStream P = System.out;
        int l, c;
        List<String> u = new ArrayList<String>();

        String[] w = p.split("\n");
        l = w.length;
        c = w[0].length();
        char[][] f = new char[l][c];
        int k = 0;
        for (String a : w) {
            f[k++] = a.toCharArray();
        }

        int I = 0;

        for (int j = 0; j < c; j++) {
            boolean T = true;
            int i = l - 1;
            int balance = 0;

            if ((i == l - 1 && f[i][j] != 'X')
                    || (f[i][j] == 'X' && c(f[i - 1][j]))) {
                continue;
            }

            boolean L = false;

            while (i >= 0 && T && !L) {
                if (f[i][j] == '\\')
                    balance--;
                if (f[i][j] == '/')
                    balance++;
                if (balance == 2 || balance == -2
                        || (balance != 0 && (c(f[i - 1][j])))) {
                    T = false;
                }
                if (i < l - 1 && (f[i][j] == '.' || f[i][j] == '$')) {
                    L = true;
                    if (f[i][j] == '$') {
                        I++;
                    } else {
                        u.add(i + ":" + j);
                    }
                } else if (f[i][j] != 'X' && c(f[i][j])) {
                    T = false;
                }
                i--;
            }
        }

        if (I == 0 && u.size() == 0) {
            P.println(":(");
        } else if (I > n || (u.size() + I) < n) {
            if (I > n) {
                P.println(n - I);
            } else {
                P.println(n - (I + u.size()));
            }
        } else {
            for (int i = 0; i < n - I; i++) {
                f[Integer.valueOf(u.get(i).split(":")[0])][Integer.valueOf(u
                        .get(i).split(":")[1])] = '$';
            }

            for (int j = 0; j < l; j++) {
                for (int m = 0; m < c; m++) {
                    P.print(f[j][m]);
                }
                P.println();
            }
        }
    }

    static boolean c(char d) {
        return d != '\\' && d != '/' && d != '|';
    }

    public static void main(String args[]) {
         f(2,"*    *  .   \n   ~ .  \\   \n  .  |  |  $\n  |  X  /  |\n  X     X  X");
        f(5, "    .  \n  . \\  \n$ | | $\n| X / |\nX   X X");
        f(2, "    .  \n  . \\  \n$ | | $\n| X / |\nX   X X");
        f(1, "    #  \n  . \\  \n$ | | $\n| X / !\n    X X");
        f(2, "    .  \n  . \\  \n. \\ | $\n| / / |\nX X X X");
        f(1, ".\n|\nX");
        // f(1, "");

        // f(" * * \n * * *\n * * .\n . $ /\n . . / | $ \\n | | \ | | |\n X X X
        // X X X", 2);
        // f(1,
        // "          .\n    #     \\\n  . /   . \\\n  | \\ $ | /\n. / / ! X /\n| X X X   X");
         f(1,"  $       *              \n  /                      \n~ | *          *         \n  \\    *                 \n. |        ~             \n/ \\     ~                \n\\ / $ .       . |        \n| \\ | | S $ . | X        \nX X X X X X X X   X | . $\n");
        // 1);
    }
}
