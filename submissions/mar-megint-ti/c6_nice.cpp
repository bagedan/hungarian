
#include <iostream>
#include <fstream>
#include <sstream>
#include <string.h>
#include <iomanip>

int r(int c, int g) {
	int m = c % g;
	return m == 0 ? c : m < g / 2 ? c - m : c - m + g;
}
int t(int c, int g) {
	int m = c % g;
	return m == 0 ? c : c - m + g;
}
void f(int c) {
	int o;
	if (c < 2000) {
		o = t(c, 100);
	} else if (c < 5000)
		o = t(c, 500);
	else {
		o = r((int) (c * 1.1), 500);
	}
	std::string s;
	int e = o - c;
	if (e == 0 || e > 1500) {
		s = "PAID BY CARD";
	} else if (e % 100 != 0) {
		s = "KEEP THE CHANGE YOU FILTY ANIMAL";
	} else {
		std::stringstream ss;
		ss << o;
		s = "HERE IS " + ss.str();
	}
	std::cout << s;
}

int main(int argc, char* argv[])
{
    f(15000);

    return 0;
}
