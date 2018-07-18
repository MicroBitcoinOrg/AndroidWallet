package com.microbitcoin.core.network.interfaces;

import com.microbitcoin.mbcj.core.Address;
import com.microbitcoin.mbcj.core.Sha256Hash;
import com.microbitcoin.mbcj.core.Transaction;
import com.microbitcoin.core.network.AddressStatus;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BlockchainConnection {
    void subscribeToBlockchain(final TransactionEventListener listener);

    void subscribeToAddresses(List<Address> addresses,
                              TransactionEventListener listener);

//    void getUnspentTx(AddressStatus status, TransactionEventListener listener);

    void getHistoryTx(AddressStatus status, TransactionEventListener listener);

    void getTransaction(Sha256Hash txHash, TransactionEventListener listener);

    void broadcastTx(final Transaction tx, final TransactionEventListener listener);

    boolean broadcastTxSync(final Transaction tx);

    void ping();

}
