// https://leetcode.com/problems/trapping-rain-water

var trap = function(height) {
    let left = 0, right = height.length - 1, maxLeft = 0, maxRight = 0, total = 0

	while (left < right) {
		if (height[left] <= height[right]) {
			if (height[left] >= maxLeft) {
				maxLeft = height[left]
			} else {
				total += maxLeft - height[left]
			}
			left++
		} else {
			if (height[right] >= maxRight) {
				maxRight = height[right]
			} else {
				total += maxRight - height[right]
			}
			right--
		}
	} 
	return total
};
