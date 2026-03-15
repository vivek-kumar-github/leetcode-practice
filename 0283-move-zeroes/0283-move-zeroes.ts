/**
 Do not return anything, modify nums in-place instead.
 */
function moveZeroes(nums: number[]): void {
    let write:number = 0;
    for (let read = 0; read < nums.length; read++) {
        if (nums[read] != 0) {
            if (read != write) {
                let temp = nums[read];
                nums[read] = nums[write];
                nums[write] = temp;
            }
            write++;
        }
    }
};