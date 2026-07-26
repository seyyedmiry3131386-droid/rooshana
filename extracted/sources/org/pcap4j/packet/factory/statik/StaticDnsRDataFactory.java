package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.DnsRDataA;
import org.pcap4j.packet.DnsRDataAaaa;
import org.pcap4j.packet.DnsRDataCName;
import org.pcap4j.packet.DnsRDataCaa;
import org.pcap4j.packet.DnsRDataHInfo;
import org.pcap4j.packet.DnsRDataMInfo;
import org.pcap4j.packet.DnsRDataMb;
import org.pcap4j.packet.DnsRDataMd;
import org.pcap4j.packet.DnsRDataMf;
import org.pcap4j.packet.DnsRDataMg;
import org.pcap4j.packet.DnsRDataMr;
import org.pcap4j.packet.DnsRDataMx;
import org.pcap4j.packet.DnsRDataNs;
import org.pcap4j.packet.DnsRDataNull;
import org.pcap4j.packet.DnsRDataPtr;
import org.pcap4j.packet.DnsRDataSoa;
import org.pcap4j.packet.DnsRDataTxt;
import org.pcap4j.packet.DnsRDataWks;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.packet.IllegalDnsRData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.UnknownDnsRData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticDnsRDataFactory implements PacketFactory<DnsResourceRecord.DnsRData, DnsResourceRecordType> {
    private static final StaticDnsRDataFactory INSTANCE = new StaticDnsRDataFactory();
    private final Map<DnsResourceRecordType, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends DnsResourceRecord.DnsRData> getTargetClass();

        DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticDnsRDataFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(DnsResourceRecordType.A, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataA> getTargetClass() {
                return DnsRDataA.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataA.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.NS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataNs> getTargetClass() {
                return DnsRDataNs.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataNs.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MD, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.3
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMd> getTargetClass() {
                return DnsRDataMd.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMd.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MF, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.4
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMf> getTargetClass() {
                return DnsRDataMf.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMf.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.CNAME, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.5
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataCName> getTargetClass() {
                return DnsRDataCName.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataCName.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.SOA, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.6
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataSoa> getTargetClass() {
                return DnsRDataSoa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataSoa.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MB, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.7
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMb> getTargetClass() {
                return DnsRDataMb.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMb.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MG, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.8
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMg> getTargetClass() {
                return DnsRDataMg.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMg.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MR, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.9
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMr> getTargetClass() {
                return DnsRDataMr.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMr.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.NULL, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.10
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataNull> getTargetClass() {
                return DnsRDataNull.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataNull.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.WKS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.11
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataWks> getTargetClass() {
                return DnsRDataWks.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataWks.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.PTR, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.12
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataPtr> getTargetClass() {
                return DnsRDataPtr.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataPtr.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.HINFO, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.13
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataHInfo> getTargetClass() {
                return DnsRDataHInfo.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataHInfo.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MINFO, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.14
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMInfo> getTargetClass() {
                return DnsRDataMInfo.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMInfo.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.MX, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.15
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMx> getTargetClass() {
                return DnsRDataMx.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataMx.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.TXT, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.16
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataTxt> getTargetClass() {
                return DnsRDataTxt.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataTxt.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.AAAA, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.17
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataAaaa> getTargetClass() {
                return DnsRDataAaaa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataAaaa.newInstance(bArr, i, i2);
            }
        });
        map.put(DnsResourceRecordType.CAA, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.18
            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataCaa> getTargetClass() {
                return DnsRDataCaa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsRDataCaa.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticDnsRDataFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends DnsResourceRecord.DnsRData> getTargetClass(DnsResourceRecordType dnsResourceRecordType) {
        if (dnsResourceRecordType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(dnsResourceRecordType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2, DnsResourceRecordType dnsResourceRecordType) {
        if (bArr != null && dnsResourceRecordType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(dnsResourceRecordType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalDnsRData.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(dnsResourceRecordType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends DnsResourceRecord.DnsRData> getTargetClass() {
        return UnknownDnsRData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i, int i2) {
        return UnknownDnsRData.newInstance(bArr, i, i2);
    }
}
