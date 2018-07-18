
package com.microbitcoin.mbcj.core.listeners;


import com.microbitcoin.mbcj.core.EmptyMessage;
import com.microbitcoin.mbcj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
@SuppressWarnings("all")
public class FeeFilterMessage extends EmptyMessage {
    public FeeFilterMessage(NetworkParameters params) {
        super(params);
    }
}
