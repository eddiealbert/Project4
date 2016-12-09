# Multi-Level Indexing vs. Flexible # of Extents
A look at sequential and random access speed, along with fragmentation in both file system implementations

### What metrics have to be considered when creating a file system?
Fragmentation is one such metric to take into consideration when designing a file system. We measure this by looking at how much free space can't be used by our current implementation. The performance of random and sequential access of data blocks are also good metrics to optimize for when designing your system. 

### How can we implement a file system that performs optimally when taking these three metrics into consideration?
I looked at two possible file system implementations as solutions.
+ **Multi-Level Indexing**
+ **Flexible # of Extents**