package org.pcap4j.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SimpleBuilder;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4Helper {
    private static Comparator<IpV4Packet> comparator = new ComparatorImpl();

    public static final class ComparatorImpl implements Comparator<IpV4Packet> {
        private ComparatorImpl() {
        }

        @Override // java.util.Comparator
        public int compare(IpV4Packet ipV4Packet, IpV4Packet ipV4Packet2) {
            return ipV4Packet.getHeader().getFragmentOffset() - ipV4Packet2.getHeader().getFragmentOffset();
        }
    }

    private IpV4Helper() {
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    public static IpV4Packet defragment(List<IpV4Packet> list) {
        Collections.sort(list, comparator);
        IpV4Packet.IpV4Header header = list.get(list.size() - 1).getHeader();
        int totalLengthAsInt = (header.getTotalLengthAsInt() + (header.getFragmentOffset() * 8)) - (header.getIhl() * 4);
        if (totalLengthAsInt <= 0) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        }
        byte[] bArr = new byte[totalLengthAsInt];
        try {
            Iterator<IpV4Packet> it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                byte[] rawData = it.next().getPayload().getRawData();
                System.arraycopy(rawData, 0, bArr, length, rawData.length);
                length += rawData.length;
            }
            IpV4Packet.Builder builder = list.get(0).getBuilder();
            builder.moreFragmentFlag(false).fragmentOffset((short) 0).payloadBuilder((Packet.Builder) new SimpleBuilder((Packet) PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, 0, totalLengthAsInt, list.get(0).getHeader().getProtocol()))).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
            return builder.build();
        } catch (ArrayStoreException unused) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        } catch (NullPointerException unused3) {
            throw new IllegalArgumentException("Can't defragment: " + list);
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.pcap4j.packet.IpV4Packet$Builder] */
    public static List<IpV4Packet> fragment(IpV4Packet ipV4Packet, int i) {
        ArrayList arrayList = new ArrayList();
        if (ipV4Packet.length() <= i) {
            arrayList.add(ipV4Packet);
            return arrayList;
        }
        IpV4Packet.IpV4Header header = ipV4Packet.getHeader();
        byte[] rawData = ipV4Packet.getPayload().getRawData();
        int length = i - header.length();
        int i2 = length % 8;
        int i3 = i2 == 0 ? length : length - i2;
        int length2 = rawData.length;
        int i4 = 0;
        while (true) {
            if (length2 > 0) {
                if (length2 <= length) {
                    byte[] bArr = new byte[length2];
                    System.arraycopy(rawData, i4, bArr, 0, length2);
                    IpV4Packet.Builder builder = ipV4Packet.getBuilder();
                    builder.moreFragmentFlag(false).fragmentOffset((short) (i4 / 8)).payloadBuilder((Packet.Builder) new UnknownPacket.Builder().rawData(bArr)).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
                    arrayList.add(builder.build());
                    break;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(rawData, i4, bArr2, 0, i3);
                IpV4Packet.Builder builder2 = ipV4Packet.getBuilder();
                builder2.moreFragmentFlag(true).fragmentOffset((short) (i4 / 8)).payloadBuilder((Packet.Builder) new UnknownPacket.Builder().rawData(bArr2)).correctChecksumAtBuild(true).correctLengthAtBuild2(true);
                arrayList.add(builder2.build());
                length2 -= i3;
                i4 += i3;
            } else {
                break;
            }
        }
        return arrayList;
    }
}
