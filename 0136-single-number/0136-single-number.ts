function singleNumber(nums: number[]): number {
    let ans:number = 0;
    for (let num of nums) {
        ans ^= num;
    }
    return ans;
};