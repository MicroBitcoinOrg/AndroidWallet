//package com.microbitcoin.core.network;
//
//import org.bitcoinj.core.Message;
//import org.bitcoinj.core.NetworkParameters;
//import org.bitcoinj.core.ProtocolException;
//import org.bitcoinj.core.Sha256Hash;
//import org.bitcoinj.core.Transaction;
//
//import javax.annotation.Nullable;
//
//public class TransactionMBC extends Transaction {
//
//    public TransactionMBC(NetworkParameters params) {
//        super(params);
//    }
//
//    public TransactionMBC(NetworkParameters params, byte[] payloadBytes) throws ProtocolException {
//        super(params, payloadBytes);
//    }
//
//    public TransactionMBC(NetworkParameters params, byte[] payload, int offset) throws ProtocolException {
//        super(params, payload, offset);
//    }
//
//    public TransactionMBC(NetworkParameters params, byte[] payload, int offset, @Nullable Message parent, boolean parseLazy, boolean parseRetain, int length) throws ProtocolException {
//        super(params, payload, offset, parent, parseLazy, parseRetain, length);
//    }
//
//    public TransactionMBC(NetworkParameters params, byte[] payload, @Nullable Message parent, boolean parseLazy, boolean parseRetain, int length) throws ProtocolException {
//        super(params, payload, parent, parseLazy, parseRetain, length);
//    }
//
//    public static final int SIGHASH_FORKID = 0xb8;
//
//    public static final int MBC_FORKID = 0xb8;
//
//
//    @Override
//    public synchronized Sha256Hash hashForSignature(int inputIndex, byte[] connectedScript, byte sigHashType) {
//        if ((sigHashType & SIGHASH_FORKID) != 0) {
//            sigHashType |= (MBC_FORKID << 8);
//        }
//
//        return super.hashForSignature(inputIndex, connectedScript, sigHashType);
//    }
//
//
//    public enum SigHash {
//        ALL(1),
//        NONE(2),
//        SINGLE(3),
//        FORKID(0xb8), // Caution: Using this type in isolation is non-standard. Treated similar to ANYONECANPAY_ALL.
//        ANYONECANPAY(0x80), // Caution: Using this type in isolation is non-standard. Treated similar to ANYONECANPAY_ALL.
//        ANYONECANPAY_ALL(0x81),
//        ANYONECANPAY_NONE(0x82),
//        ANYONECANPAY_SINGLE(0x83),
//        UNSET(0); // Caution: Using this type in isolation is non-standard. Treated similar to ALL.
//
//        public final int value;
//
//        /**
//         * @param value
//         */
//        private SigHash(final int value) {
//            this.value = value;
//        }
//
//        /**
//         * @return the value as a byte
//         */
//        public byte byteValue() {
//            return (byte) this.value;
//        }
//    }
//
//    public static final byte SIGHASH_ANYONECANPAY_VALUE = (byte) 0x80;
//
//}
