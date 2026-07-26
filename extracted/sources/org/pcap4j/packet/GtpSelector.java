package org.pcap4j.packet;

import org.pcap4j.packet.GtpV1Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class GtpSelector extends AbstractPacket {
    private static final long serialVersionUID = 5081921978086270980L;

    /* JADX INFO: renamed from: org.pcap4j.packet.GtpSelector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType;

        static {
            int[] iArr = new int[GtpV1Packet.ProtocolType.values().length];
            $SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType = iArr;
            try {
                iArr[GtpV1Packet.ProtocolType.GTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType[GtpV1Packet.ProtocolType.GTP_PRIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GtpSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        byte b = bArr[i];
        return ((b >> 5) & 7) != 1 ? (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i, i2, NotApplicable.UNKNOWN) : AnonymousClass1.$SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType[GtpV1Packet.ProtocolType.getInstance((b & 16) != 0).ordinal()] != 1 ? (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i, i2, NotApplicable.UNKNOWN) : GtpV1Packet.newPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
