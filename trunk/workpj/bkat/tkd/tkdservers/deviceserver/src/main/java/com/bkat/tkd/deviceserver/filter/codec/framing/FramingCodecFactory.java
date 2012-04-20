package com.bkat.tkd.deviceserver.filter.codec.framing;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class FramingCodecFactory implements ProtocolCodecFactory {

	private final FramingEncoder encoder;
	private final FramingDecoder decoder;
	
	public FramingCodecFactory(Charset charset) {
		encoder = new FramingEncoder(charset);
		decoder = new FramingDecoder(charset);
	}
	
	public FramingCodecFactory() {
		this(Charset.forName("US-ASCII"));
	}

	public ProtocolDecoder getDecoder(IoSession arg0) throws Exception {
		return decoder;
	}

	public ProtocolEncoder getEncoder(IoSession arg0) throws Exception {
		return encoder;
	}

}
