select ID, FISH_NAME, a.LENGTH
from FISH_INFO as a inner join FISH_NAME_INFO as b on a.FISH_TYPE = b.FISH_TYPE
where a.FISH_TYPE in
(
    select FISH_TYPE
    from FISH_INFO
    group by FISH_TYPE
    having LENGTH = max(LENGTH)
)
order by ID;
