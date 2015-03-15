Benchmark scala collections
===========================

First results:

    L - List
    V - Vector
    Q - Queue


    [info] # Run complete. Total time: 06:11:26
    [info]
    [info] Benchmark                  (field)   Mode  Cnt           Score         Error  Units
    [info] CollectionsBench.appendL       100  thrpt  200     1052677.108 ±    8870.035  ops/s
    [info] CollectionsBench.appendL       200  thrpt  200      540527.664 ±    2128.963  ops/s
    [info] CollectionsBench.appendL       500  thrpt  200      174373.236 ±     483.382  ops/s
    [info] CollectionsBench.appendL      1000  thrpt  200       86720.192 ±     323.455  ops/s
    [info] CollectionsBench.appendL     10000  thrpt  200        8557.036 ±      37.602  ops/s
    [info] CollectionsBench.appendL    100000  thrpt  200         413.956 ±       2.999  ops/s
    [info] CollectionsBench.appendL   1000000  thrpt  200         141.350 ±       2.821  ops/s
    [info] CollectionsBench.appendL   2000000  thrpt  200          50.210 ±       1.031  ops/s
    [info] CollectionsBench.appendL   3000000  thrpt  200          30.451 ±       0.796  ops/s
    [info] CollectionsBench.appendQ       100  thrpt  200   277509823.462 ±  911071.115  ops/s
    [info] CollectionsBench.appendQ       200  thrpt  200   277385530.996 ± 1054981.541  ops/s
    [info] CollectionsBench.appendQ       500  thrpt  200   277559784.125 ±  999769.620  ops/s
    [info] CollectionsBench.appendQ      1000  thrpt  200   275398111.733 ± 1560740.798  ops/s
    [info] CollectionsBench.appendQ     10000  thrpt  200   277597449.505 ±  948017.157  ops/s
    [info] CollectionsBench.appendQ    100000  thrpt  200   277926002.907 ± 1030080.933  ops/s
    [info] CollectionsBench.appendQ   1000000  thrpt  200   276552021.187 ± 1291251.283  ops/s
    [info] CollectionsBench.appendQ   2000000  thrpt  200   281475406.437 ± 1393658.486  ops/s
    [info] CollectionsBench.appendQ   3000000  thrpt  200   281981592.427 ± 1169804.678  ops/s
    [info] CollectionsBench.appendV       100  thrpt  200    21521810.141 ±   68827.072  ops/s
    [info] CollectionsBench.appendV       200  thrpt  200    21296981.751 ±  214098.556  ops/s
    [info] CollectionsBench.appendV       500  thrpt  200    21576785.070 ±   83802.249  ops/s
    [info] CollectionsBench.appendV      1000  thrpt  200    21438299.639 ±   70657.780  ops/s
    [info] CollectionsBench.appendV     10000  thrpt  200    15602983.256 ±   44387.608  ops/s
    [info] CollectionsBench.appendV    100000  thrpt  200    25553227.690 ±  104353.047  ops/s
    [info] CollectionsBench.appendV   1000000  thrpt  200    25698787.661 ±   71126.064  ops/s
    [info] CollectionsBench.appendV   2000000  thrpt  200    24527586.525 ±   79882.431  ops/s
    [info] CollectionsBench.appendV   3000000  thrpt  200    24452243.179 ±  105966.695  ops/s
    [info] CollectionsBench.prependL      100  thrpt  200  1003688652.065 ± 6087158.758  ops/s
    [info] CollectionsBench.prependL      200  thrpt  200  1006026154.386 ± 5797557.349  ops/s
    [info] CollectionsBench.prependL      500  thrpt  200  1003698031.261 ± 6068927.027  ops/s
    [info] CollectionsBench.prependL     1000  thrpt  200  1006501228.343 ± 5883575.284  ops/s
    [info] CollectionsBench.prependL    10000  thrpt  200  1005503115.109 ± 6489080.913  ops/s
    [info] CollectionsBench.prependL   100000  thrpt  200  1006872942.780 ± 5492604.258  ops/s
    [info] CollectionsBench.prependL  1000000  thrpt  200  1007106343.774 ± 5412487.992  ops/s
    [info] CollectionsBench.prependL  2000000  thrpt  200  1004306898.308 ± 6610968.511  ops/s
    [info] CollectionsBench.prependL  3000000  thrpt  200  1008262058.394 ± 5342039.685  ops/s
    [info] CollectionsBench.prependQ      100  thrpt  200   276460795.360 ± 1015579.227  ops/s
    [info] CollectionsBench.prependQ      200  thrpt  200   277321236.641 ±  950929.164  ops/s
    [info] CollectionsBench.prependQ      500  thrpt  200   277480049.350 ± 1322862.692  ops/s
    [info] CollectionsBench.prependQ     1000  thrpt  200   279661257.208 ±  928582.132  ops/s
    [info] CollectionsBench.prependQ    10000  thrpt  200   279968067.636 ± 1032035.900  ops/s
    [info] CollectionsBench.prependQ   100000  thrpt  200   279504792.752 ± 1075814.678  ops/s
    [info] CollectionsBench.prependQ  1000000  thrpt  200   282466664.860 ± 1453174.450  ops/s
    [info] CollectionsBench.prependQ  2000000  thrpt  200   294603313.470 ± 2187511.842  ops/s
    [info] CollectionsBench.prependQ  3000000  thrpt  200   285151125.910 ± 2145620.282  ops/s
    [info] CollectionsBench.prependV      100  thrpt  200    16380477.778 ±   40521.809  ops/s
    [info] CollectionsBench.prependV      200  thrpt  200    16116518.614 ±   54196.789  ops/s
    [info] CollectionsBench.prependV      500  thrpt  200    16247395.111 ±   65953.528  ops/s
    [info] CollectionsBench.prependV     1000  thrpt  200    13633306.803 ±   37899.744  ops/s
    [info] CollectionsBench.prependV    10000  thrpt  200    12596167.911 ±   34684.407  ops/s
    [info] CollectionsBench.prependV   100000  thrpt  200    10168739.199 ±   24636.123  ops/s
    [info] CollectionsBench.prependV  1000000  thrpt  200     9946478.096 ±   31525.873  ops/s
    [info] CollectionsBench.prependV  2000000  thrpt  200     8374546.890 ±   48035.246  ops/s
    [info] CollectionsBench.prependV  3000000  thrpt  200     8333013.429 ±   53857.358  ops/s

