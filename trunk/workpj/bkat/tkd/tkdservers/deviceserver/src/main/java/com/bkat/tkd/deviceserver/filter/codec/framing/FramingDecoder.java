package com.bkat.tkd.deviceserver.filter.codec.framing;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

import com.bkat.tkd.deviceserver.common.MessageFormat;

/**
 * Deframing input message to get the size of output message.
 * 
 * @author dn
 *
 */
public class FramingDecoder implements ProtocolDecoder {

	private final Charset charset;

	private String headerStr = "";
	private int headerLength = MessageFormat.HEADER_LENGTH;
	private int headerCount = 0;
	private int msgLength = 0;
	private int msgCount = 0;
	
	/*
	 * Status of current processing.
	 * 0: not matched.
	 * 1: matched, ready for get size.
	 * 2: got size, 
	 */
	private int status = 0;
	
	public FramingDecoder(Charset charset) {
		if (charset == null) {
            throw new IllegalArgumentException("charset parameter shuld not be null");
        }
		this.charset = charset;
	}
	
	/**
	 * First check for header.
	 * If header matched, get message size field (1 byte).
	 * Get the message with given size and write to out.
	 */
	public void decode(IoSession session, IoBuffer in, ProtocolDecoderOutput out)
			throws Exception {
		
	}

	public void dispose(IoSession session) throws Exception {
		// TODO Auto-generated method stub

	}

	public void finishDecode(IoSession session, ProtocolDecoderOutput out)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
