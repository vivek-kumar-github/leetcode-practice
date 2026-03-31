function singleNumber(nums: number[]): number {
    //using bit manipulation
    let ones: number = 0, twos: number = 0;
    for (let num of nums) {
        ones = (ones ^ num) & ~twos;
        twos = (twos ^ num) & ~ones;
    }
    return ones;
};