SELECT USER_ID FROM mock_sba.USERS
WHERE FIRST_NAME = 'Marion'; /* Returns USER_ID: 3 */

SELECT * FROM mock_sba.ORDERS
WHERE USER_ID = 3;