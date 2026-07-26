package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class SshPacket extends AbstractPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SshPacket.class);
    private static final long serialVersionUID = 1;

    private SshPacket() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        try {
            return Ssh2VersionExchangePacket.newPacket(bArr, i, i2);
        } catch (IllegalRawDataException e) {
            logger.debug("rawData seems not SSH2 version exchange packet.", (Throwable) e);
            return Ssh2BinaryPacket.newPacket(bArr, i, i2);
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
