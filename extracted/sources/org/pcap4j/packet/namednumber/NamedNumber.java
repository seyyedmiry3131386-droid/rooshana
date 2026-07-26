package org.pcap4j.packet.namednumber;

import defpackage.dw1;
import defpackage.rm7;
import java.io.Serializable;
import java.lang.Number;
import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NamedNumber<T extends Number, U extends NamedNumber<T, ?>> implements Comparable<U>, Serializable {
    private static final long serialVersionUID = 3858426889927624965L;
    private final String name;
    private final T value;

    public NamedNumber(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException("value is null.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name is null.");
        }
        this.value = t;
        this.name = str;
    }

    @Override // java.lang.Comparable
    public abstract int compareTo(U u);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedNumber namedNumber = (NamedNumber) obj;
        return this.name.equals(namedNumber.name) && this.value.equals(namedNumber.value);
    }

    public int hashCode() {
        return this.value.hashCode() + rm7.k(this.name, 31, 31);
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(70);
        sb.append(valueAsString());
        sb.append(" (");
        return dw1.s(sb, this.name, ")");
    }

    public T value() {
        return this.value;
    }

    public String valueAsString() {
        return this.value.toString();
    }
}
