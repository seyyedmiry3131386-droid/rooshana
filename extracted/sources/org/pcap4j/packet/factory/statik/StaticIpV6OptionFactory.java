package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV6Option;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.IpV6Pad1Option;
import org.pcap4j.packet.IpV6PadNOption;
import org.pcap4j.packet.UnknownIpV6Option;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV6OptionType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV6OptionFactory implements PacketFactory<IpV6ExtOptionsPacket.IpV6Option, IpV6OptionType> {
    private static final StaticIpV6OptionFactory INSTANCE = new StaticIpV6OptionFactory();
    private final Map<IpV6OptionType, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass();

        IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticIpV6OptionFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(IpV6OptionType.PAD1, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public Class<IpV6Pad1Option> getTargetClass() {
                return IpV6Pad1Option.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6Pad1Option.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV6OptionType.PADN, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public Class<IpV6PadNOption> getTargetClass() {
                return IpV6PadNOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6PadNOption.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticIpV6OptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass(IpV6OptionType ipV6OptionType) {
        if (ipV6OptionType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV6OptionType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i, int i2, IpV6OptionType ipV6OptionType) {
        if (bArr != null && ipV6OptionType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV6OptionType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalIpV6Option.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(ipV6OptionType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass() {
        return UnknownIpV6Option.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownIpV6Option.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalIpV6Option.newInstance(bArr, i, i2);
        }
    }
}
