Benchmark scala collections
===========================

First results:

    L - List
    V - Vector
    Q - Queue

    [info] # Run complete. Total time: 00:40:28
    [info]
    [info] Benchmark                   Mode  Cnt          Score         Error  Units
    [info] CollectionsBench.appendL   thrpt  200       3024.985 ±     249.712  ops/s
    [info] CollectionsBench.appendQ   thrpt  200  267095944.794 ± 3858761.164  ops/s
    [info] CollectionsBench.appendV   thrpt  200   27278088.765 ±  215403.935  ops/s
    [info] CollectionsBench.prependL  thrpt  200  886433424.818 ± 2688512.575  ops/s
    [info] CollectionsBench.prependQ  thrpt  200  273010011.644 ±  636277.223  ops/s
    [info] CollectionsBench.prependV  thrpt  200   12539866.327 ±   27572.499  ops/s

