var a = [
[" ", " ", "v", " "],
[" ", "@", " ", "1"],
[" ", ">", " ", "1"]
];

var turretId = 9;
for (var i = 0; i < a.length; i++) {
	for (var j = 0; j < a[i].length; j++) {
		if (a[i][j] == "v") {
			printline(i+1,j,++turretId,"down");
		} else if (a[i][j] == ">") {
			printline(i,j+1,++turretId,"right");
		} else if (a[i][j] == "<") {
			printline(i,j-1,++turretId,"left");
		} else if (a[i][j] == "^") {
			printline(i-1,j,++turretId,"up");
		}
	}
}
console.log(a.map(function(line) {return line.join();}).join("\n"));

function printline(i,j,turretId,dir) {
	while (i<a[0].length && j<a.length && -1 < i && -1 < j) {
		if (dir == "down") {
			if (a[i][j] == " ") {
				a[i][j]=turretId;
				i++;
			} else if (a[i][j] == "/") {
				dir = "left";
				j--;
			} else if (a[i][j] == "\\") {
				dir = "right";
				j++;
			} else {
				break;
			}
		} else if (dir == "left") {
			if (a[i][j] == " ") {
				a[i][j] = turretId;
				i--;
			} else if (a[i][j] == "/") {
				dir = "down";
				i++;
			} else if (a[i][j] == "\\") {
				dir = "up";
				i--;
			} else {
				break;
			}
		} else if (dir == "right") {
			if (a[i][j] == " ") {
				a[i][j] = turretId;
				j++;
			} else if (a[i][j] == "/") {
				dir = "up";
				i--;
			} else if (a[i][j] == "\\") {
				dir = "down";
				i++;
			} else {
				break;
			}
		} else {
			if (a[i][j] == " ") {
				a[i][j] = turretId;
				i--;
			} else if (a[i][j] == "/") {
				dir = "right";
				j++;
			} else if (a[i][j] == "\\") {
				dir = "left";
				j--;
			} else {
				break;
			}
		}
	}
};