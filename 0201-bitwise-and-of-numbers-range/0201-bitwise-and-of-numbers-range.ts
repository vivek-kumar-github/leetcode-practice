function rangeBitwiseAnd(left: number, right: number): number {
    //using bit shift, common prefix of bits
    let shifts: number = 0;
    while (left != right) {
        left >>= 1;
        right >>= 1;
        shifts++;
    }
    return left << shifts;
};