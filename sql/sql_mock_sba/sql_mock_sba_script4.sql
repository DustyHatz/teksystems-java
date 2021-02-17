/* Create a query to return the Order Id, Item name, Item Price, and Quantity from orders made at stores in the city “New York”. Order by Order Id in ascending order.  */

SELECT STORE_ID 
FROM mock_sba.STORES
WHERE CITY = 'New York';