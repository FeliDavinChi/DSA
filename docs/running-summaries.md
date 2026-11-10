# Running minima and prefix-suffix passes

A running summary stores the part of the input that the current calculation needs. Write down which indices belong in that summary before deciding when to update it.

- [Best Time to Buy and Sell Stock](../0121-best-time-to-buy-and-sell-stock/) uses the minimum price from earlier days for each candidate sell day. Compute the day’s profit against that minimum, then include the current price in the running minimum for future days. Initialize the best profit to zero. A decreasing sequence such as `[5, 4, 3]` leaves it at zero.
- [Product of Array Except Self](../0238-product-of-array-except-self/) can use the result array for exclusive prefix products. In the forward pass, write the product of elements strictly to the left. In the backward pass, multiply that value by the running product of elements strictly to the right. Start both running products at `1`. With `[2, 0, 3]`, the result is `[0, 6, 0]`. Two zeros make every result element zero.
- [Trapping Rain Water](../0042-trapping-rain-water/) can precompute the highest bar at or to the left of each position and the highest bar at or to the right. The smaller of those two heights sets the water level at that position. Subtract the position’s own height and sum the results. In `[3, 0, 2]`, the middle position holds `2` units. A monotone profile holds zero.

Each approach makes a constant number of linear passes. The stock scan keeps constant state. The product passes use constant extra state beyond the result array. The rain water approach described here stores two arrays of length `n`.
