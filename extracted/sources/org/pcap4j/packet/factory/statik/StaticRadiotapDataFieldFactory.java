package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRadiotapData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.RadiotapDataAMpduStatus;
import org.pcap4j.packet.RadiotapDataAntenna;
import org.pcap4j.packet.RadiotapDataAntennaNoise;
import org.pcap4j.packet.RadiotapDataAntennaSignal;
import org.pcap4j.packet.RadiotapDataChannel;
import org.pcap4j.packet.RadiotapDataDbAntennaNoise;
import org.pcap4j.packet.RadiotapDataDbAntennaSignal;
import org.pcap4j.packet.RadiotapDataDbTxAttenuation;
import org.pcap4j.packet.RadiotapDataDbmTxPower;
import org.pcap4j.packet.RadiotapDataFhss;
import org.pcap4j.packet.RadiotapDataFlags;
import org.pcap4j.packet.RadiotapDataLockQuality;
import org.pcap4j.packet.RadiotapDataMcs;
import org.pcap4j.packet.RadiotapDataRate;
import org.pcap4j.packet.RadiotapDataRxFlags;
import org.pcap4j.packet.RadiotapDataTsft;
import org.pcap4j.packet.RadiotapDataTxAttenuation;
import org.pcap4j.packet.RadiotapDataVht;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.UnknownRadiotapData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.RadiotapPresentBitNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticRadiotapDataFieldFactory implements PacketFactory<RadiotapPacket.RadiotapData, RadiotapPresentBitNumber> {
    private static final StaticRadiotapDataFieldFactory INSTANCE = new StaticRadiotapDataFieldFactory();
    private final Map<RadiotapPresentBitNumber, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends RadiotapPacket.RadiotapData> getTargetClass();

        RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticRadiotapDataFieldFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(RadiotapPresentBitNumber.TSFT, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataTsft> getTargetClass() {
                return RadiotapDataTsft.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataTsft.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.FLAGS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataFlags> getTargetClass() {
                return RadiotapDataFlags.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataFlags.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.RATE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.3
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataRate> getTargetClass() {
                return RadiotapDataRate.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataRate.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.CHANNEL, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.4
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataChannel> getTargetClass() {
                return RadiotapDataChannel.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataChannel.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.FHSS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.5
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataFhss> getTargetClass() {
                return RadiotapDataFhss.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataFhss.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.ANTENNA_SIGNAL, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.6
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntennaSignal> getTargetClass() {
                return RadiotapDataAntennaSignal.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataAntennaSignal.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.ANTENNA_NOISE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.7
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntennaNoise> getTargetClass() {
                return RadiotapDataAntennaNoise.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataAntennaNoise.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.LOCK_QUALITY, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.8
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataLockQuality> getTargetClass() {
                return RadiotapDataLockQuality.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataLockQuality.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.TX_ATTENUATION, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.9
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataTxAttenuation> getTargetClass() {
                return RadiotapDataTxAttenuation.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataTxAttenuation.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.DB_TX_ATTENUATION, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.10
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbTxAttenuation> getTargetClass() {
                return RadiotapDataDbTxAttenuation.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataDbTxAttenuation.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.DBM_TX_POWER, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.11
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbmTxPower> getTargetClass() {
                return RadiotapDataDbmTxPower.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataDbmTxPower.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.ANTENNA, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.12
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntenna> getTargetClass() {
                return RadiotapDataAntenna.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataAntenna.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.DB_ANTENNA_SIGNAL, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.13
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbAntennaSignal> getTargetClass() {
                return RadiotapDataDbAntennaSignal.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataDbAntennaSignal.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.DB_ANTENNA_NOISE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.14
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbAntennaNoise> getTargetClass() {
                return RadiotapDataDbAntennaNoise.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataDbAntennaNoise.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.RX_FLAGS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.15
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataRxFlags> getTargetClass() {
                return RadiotapDataRxFlags.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataRxFlags.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.MCS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.16
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataMcs> getTargetClass() {
                return RadiotapDataMcs.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataMcs.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.A_MPDU_STATUS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.17
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAMpduStatus> getTargetClass() {
                return RadiotapDataAMpduStatus.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataAMpduStatus.newInstance(bArr, i, i2);
            }
        });
        map.put(RadiotapPresentBitNumber.VHT, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.18
            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataVht> getTargetClass() {
                return RadiotapDataVht.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapDataVht.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticRadiotapDataFieldFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends RadiotapPacket.RadiotapData> getTargetClass(RadiotapPresentBitNumber radiotapPresentBitNumber) {
        if (radiotapPresentBitNumber == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(radiotapPresentBitNumber);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2, RadiotapPresentBitNumber radiotapPresentBitNumber) {
        if (bArr != null && radiotapPresentBitNumber != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(radiotapPresentBitNumber);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalRadiotapData.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(radiotapPresentBitNumber);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends RadiotapPacket.RadiotapData> getTargetClass() {
        return UnknownRadiotapData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i, int i2) {
        return UnknownRadiotapData.newInstance(bArr, i, i2);
    }
}
