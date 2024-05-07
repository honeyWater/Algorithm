select count(*) as count
from ecoli_data
where genotype & 2 = 0 and (genotype & 1 > 0 or genotype & 4 > 0);

# 2번형질 - 2  10
# 1번형질 - 1  01
# 3번형질 - 4 100

# where cast(conv(genotype, 10, 2) as character) like '%101'
# or cast(conv(genotype, 10, 2) as character) like '%100'
# or cast(conv(genotype, 10, 2) as character) like '%01';

# where substr(cast(conv(genotype, 10, 2) as character), -3, 3) = '101';
# where cast(conv(genotype, 10, 2) as character) like '%101';