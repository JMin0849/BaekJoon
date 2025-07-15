SELECT a.REST_ID, a.REST_NAME, a.FOOD_TYPE, a.FAVORITES, a.ADDRESS, ROUND(AVG(b.review_score), 2) as SCORE from rest_info as a inner join rest_review as b on a.rest_id = b.rest_id
GROUP BY a.rest_id
HAVING a.ADDRESS LIKE '서울%'
order by SCORE desc, a.favorites desc;