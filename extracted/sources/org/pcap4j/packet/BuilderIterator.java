package org.pcap4j.packet;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.pcap4j.packet.Packet;

/* JADX INFO: loaded from: classes4.dex */
public final class BuilderIterator implements Iterator<Packet.Builder> {
    private Packet.Builder next;
    private Packet.Builder previous = null;

    public BuilderIterator(Packet.Builder builder) {
        this.next = builder;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public Packet.Builder next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Packet.Builder builder = this.next;
        this.previous = builder;
        this.next = builder.getPayloadBuilder();
        return this.previous;
    }
}
