def trap(bars):
    if not bars or len(bars) < 3:
        return 0
    volume = 0
    left, right = 0, len(bars) - 1
    l_max, r_max = bars[left], bars[right]
    while left < right:
        l_max, r_max = max(bars[left], l_max), max(bars[right], r_max)
        if l_max <= r_max:
            volume += l_max - bars[left]
            left += 1
        else:
            volume += r_max - bars[right]
            right -= 1
    return volume

h = [2,0,4,0,2]
print(trap(h))

def trap(height):
    waterLevel = []
    left = 0
    for h in height:
        left = max(left, h) 
        waterLevel += [left] 
    right = 0
    for i, h in reversed(list(enumerate(height))):
        right = max(right, h)
        waterLevel[i] = min(waterLevel[i], right) - h 
    return sum(waterLevel)

h = [4,2,0,3,2,5,1]
print(trap(h))
