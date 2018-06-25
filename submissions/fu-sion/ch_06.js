function f(cost) {
    var tipped;
    if (cost < 2000) {
        tipped = (cost % 100 != 0) ? (~~((cost + 100) / 100)) * 100 : cost;
    } else if (2000 <= cost && cost < 5000) {
        tipped = (cost % 500 != 0) ? (~~((cost + 500) / 500)) * 500 : cost;
    } else {
        tipped = (cost*1.1)|0;
        tipped = (tipped % 500 > 250) ? (~~((tipped + 500) / 500 )) * 500 : ~~((tipped) / 500 ) * 500;
    }
    cost = tipped - cost;

    var res;
    if (cost == 0 || cost > 1500) {
        res = "PAID BY CARD";
    } else if (cost % 100 != 0) {
        res = "KEEP THE CHANGE YOU FILTY ANIMAL";
    } else {
        res = "HERE IS " + tipped;
    }
    console.log(res);
}
