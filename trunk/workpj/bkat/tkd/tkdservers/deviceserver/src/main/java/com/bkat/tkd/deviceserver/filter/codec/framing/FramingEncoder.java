package com.bkat.tkd.deviceserver.filter.codec.framing;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class FramingEncoder implements ProtocolEncoder {
	
	private final Charset charset;
	
	public FramingEncoder(Charset charset) {
		this.charset = charset;
	}

	public void dispose(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	public void encode(IoSession arg0, Object arg1, ProtocolEncoderOutput arg2)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
