package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2NameList implements Serializable {
    private static final long serialVersionUID = 8625201821104360377L;
    private final int length;
    private final List<String> list;

    public Ssh2NameList(List<String> list) {
        if (list == null) {
            throw new NullPointerException("list may not be null");
        }
        this.list = new ArrayList(list);
        this.length = calcLength();
    }

    private int calcLength() {
        Iterator<String> it = this.list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int length = it.next().length() + i;
            if (it.hasNext()) {
                length++;
            }
            i = length;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!Ssh2NameList.class.isInstance(obj)) {
            return false;
        }
        Ssh2NameList ssh2NameList = (Ssh2NameList) obj;
        return this.length == ssh2NameList.length && this.list.equals(ssh2NameList.list);
    }

    public int getLength() {
        return this.length;
    }

    public List<String> getList() {
        return new ArrayList(this.list);
    }

    public byte[] getRawData() {
        String string = toString();
        byte[] bArr = new byte[string.length() + 4];
        System.arraycopy(ByteArrays.toByteArray(this.length), 0, bArr, 0, 4);
        System.arraycopy(string.getBytes(), 0, bArr, 4, string.length());
        return bArr;
    }

    public int hashCode() {
        return this.list.hashCode() + ((527 + this.length) * 31);
    }

    public int length() {
        return getRawData().length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.length);
        Iterator<String> it = this.list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public Ssh2NameList(String... strArr) {
        this.list = new ArrayList();
        for (String str : strArr) {
            this.list.add(str);
        }
        this.length = calcLength();
    }

    public Ssh2NameList(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        if (i2 >= 4) {
            int i3 = ByteArrays.getInt(bArr, i);
            this.length = i3;
            if (i3 < 0) {
                StringBuilder sbA = o40.A(120, "A name-list the length of which is longer than 2147483647 is not supported. length: ");
                sbA.append(((long) i3) & 4294967295L);
                throw new IllegalRawDataException(sbA.toString());
            }
            if (i2 - 4 >= i3) {
                this.list = Arrays.asList(new String(bArr, i + 4, i3).split(","));
                return;
            }
            StringBuilder sbA2 = o40.A(110, "The data is too short to build an Ssh2NameList (");
            sbA2.append(i3 + 4);
            sbA2.append(" bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        StringBuilder sbA3 = o40.A(100, "The rawData length must be more than 3. rawData: ");
        t61.t(i, " ", ", offset: ", sbA3, bArr);
        sbA3.append(", length: ");
        sbA3.append(i2);
        throw new IllegalRawDataException(sbA3.toString());
    }
}
