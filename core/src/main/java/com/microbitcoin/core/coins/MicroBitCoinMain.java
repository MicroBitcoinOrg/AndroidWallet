package com.microbitcoin.core.coins;

import com.microbitcoin.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class MicroBitCoinMain extends CoinType {
    private MicroBitCoinMain() {
        id = "microbitcoin.main";

        addressHeader = 26;
        p2shHeader = 5;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 60;

        family = BitFamily.get();
        name = "MicroBitcoin";
        symbol = "MBC";
        uriScheme = "MicroBitcoin";
        bip44Index = 0;
        unitExponent = 4;
        feePerKb = value(1000); // 0.0001 AUM
        minNonDust = value(1);
        softDustLimit = value(10000); // 0.01 AUM
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Bitcoin Signed Message:\n");
    }

    private static MicroBitCoinMain instance = new MicroBitCoinMain();

    public static synchronized CoinType get() {
        return instance;
    }
}