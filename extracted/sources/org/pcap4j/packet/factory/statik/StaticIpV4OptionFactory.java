package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV4Option;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4EndOfOptionList;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.packet.IpV4LooseSourceRouteOption;
import org.pcap4j.packet.IpV4NoOperationOption;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4RecordRouteOption;
import org.pcap4j.packet.IpV4Rfc791SecurityOption;
import org.pcap4j.packet.IpV4StreamIdOption;
import org.pcap4j.packet.IpV4StrictSourceRouteOption;
import org.pcap4j.packet.UnknownIpV4Option;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV4OptionType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV4OptionFactory implements PacketFactory<IpV4Packet.IpV4Option, IpV4OptionType> {
    private static final StaticIpV4OptionFactory INSTANCE = new StaticIpV4OptionFactory();
    private final Map<IpV4OptionType, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends IpV4Packet.IpV4Option> getTargetClass();

        IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticIpV4OptionFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(IpV4OptionType.END_OF_OPTION_LIST, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4EndOfOptionList> getTargetClass() {
                return IpV4EndOfOptionList.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4EndOfOptionList.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.NO_OPERATION, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4NoOperationOption> getTargetClass() {
                return IpV4NoOperationOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4NoOperationOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.SECURITY, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.3
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4Rfc791SecurityOption> getTargetClass() {
                return IpV4Rfc791SecurityOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4Rfc791SecurityOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.LOOSE_SOURCE_ROUTING, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.4
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4LooseSourceRouteOption> getTargetClass() {
                return IpV4LooseSourceRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4LooseSourceRouteOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.INTERNET_TIMESTAMP, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.5
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4InternetTimestampOption> getTargetClass() {
                return IpV4InternetTimestampOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4InternetTimestampOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.RECORD_ROUTE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.6
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4RecordRouteOption> getTargetClass() {
                return IpV4RecordRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4RecordRouteOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.STREAM_ID, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.7
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4StreamIdOption> getTargetClass() {
                return IpV4StreamIdOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4StreamIdOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV4OptionType.STRICT_SOURCE_ROUTING, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.8
            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4StrictSourceRouteOption> getTargetClass() {
                return IpV4StrictSourceRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4StrictSourceRouteOption.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticIpV4OptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4Packet.IpV4Option> getTargetClass(IpV4OptionType ipV4OptionType) {
        if (ipV4OptionType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV4OptionType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2, IpV4OptionType ipV4OptionType) {
        if (bArr != null && ipV4OptionType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV4OptionType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalIpV4Option.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(ipV4OptionType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4Packet.IpV4Option> getTargetClass() {
        return UnknownIpV4Option.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownIpV4Option.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalIpV4Option.newInstance(bArr, i, i2);
        }
    }
}
