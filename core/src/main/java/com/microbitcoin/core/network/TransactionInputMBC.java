package com.microbitcoin.core.network;

import org.bitcoinj.core.Coin;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.ProtocolException;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.core.TransactionOutPoint;

import javax.annotation.Nullable;

public class TransactionInputMBC extends TransactionInput {
    public TransactionInputMBC(NetworkParameters params, @Nullable Transaction parentTransaction, byte[] scriptBytes) {
        super(params, parentTransaction, scriptBytes);
    }

    public TransactionInputMBC(NetworkParameters params, @Nullable Transaction parentTransaction, byte[] scriptBytes, TransactionOutPoint outpoint) {
        super(params, parentTransaction, scriptBytes, outpoint);
    }

    public TransactionInputMBC(NetworkParameters params, @Nullable Transaction parentTransaction, byte[] scriptBytes, TransactionOutPoint outpoint, @Nullable Coin value) {
        super(params, parentTransaction, scriptBytes, outpoint, value);
    }

    public TransactionInputMBC(NetworkParameters params, @Nullable Transaction parentTransaction, byte[] payload, int offset) throws ProtocolException {
        super(params, parentTransaction, payload, offset);
    }

    public TransactionInputMBC(NetworkParameters params, Transaction parentTransaction, byte[] payload, int offset, boolean parseLazy, boolean parseRetain) throws ProtocolException {
        super(params, parentTransaction, payload, offset, parseLazy, parseRetain);
    }
}
