package com.microbitcoin.core.network.interfaces;

import com.microbitcoin.mbcj.core.Transaction;
import com.microbitcoin.core.network.AddressStatus;
import com.microbitcoin.core.network.BlockHeader;
import com.microbitcoin.core.network.ServerClient;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface TransactionEventListener {
    void onNewBlock(BlockHeader header);

    void onAddressStatusUpdate(AddressStatus status);

//    void onUnspentTransactionUpdate(AddressStatus status, List<ServerClient.UnspentTx> unspentTxes);

    void onTransactionHistory(AddressStatus status, List<ServerClient.HistoryTx> historyTxes);

    void onTransactionUpdate(Transaction tx);

    void onTransactionBroadcast(Transaction transaction);

    void onTransactionBroadcastError(Transaction tx);
}
