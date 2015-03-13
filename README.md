Benchmark scala collections
===========================

First results:

    L - List
    V - Vector
    Q - Queue

    [info] # Run complete. Total time: 00:40:38
    [info]
    [info] Benchmark                   Mode  Cnt          Score          Error  Units
    [info] CollectionsBench.appendL   thrpt  200       3058.230 ±      290.063  ops/s
    [info] CollectionsBench.appendQ   thrpt  200  250411043.337 ±  6676006.832  ops/s
    [info] CollectionsBench.appendV   thrpt  200   25579012.821 ±   491771.967  ops/s
    [info] CollectionsBench.prependL  thrpt  200  965448340.013 ± 19758333.707  ops/s
    [info] CollectionsBench.prependQ  thrpt  200  247835485.583 ±  7878017.288  ops/s
    [info] CollectionsBench.prependV  thrpt  200   11797247.782 ±   298206.654  ops/s
