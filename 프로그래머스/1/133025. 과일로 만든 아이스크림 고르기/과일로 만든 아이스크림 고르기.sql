SELECT a.FLAVOR
from FIRST_HALF as a inner join ICECREAM_INFO as b
on a.FLAVOR = b.FLAVOR
where (a.TOTAL_ORDER > 3000) and (b.INGREDIENT_TYPE ='fruit_based')
order by a.TOTAL_ORDER desc;