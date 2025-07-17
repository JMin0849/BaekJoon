select a.ITEM_ID, a.ITEM_NAME, a.RARITY
from ITEM_INFO as a inner join ITEM_TREE as b on a.ITEM_ID = b.ITEM_ID
where b.PARENT_ITEM_ID in (select ITEM_ID
                            from ITEM_INFO
                         where RARITY = 'RARE')
order by a.ITEM_ID desc;