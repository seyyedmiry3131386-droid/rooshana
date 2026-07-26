package ir.mservices.market.pika.connect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectionType implements Serializable {

    public static final class Advertise extends ConnectionType {
        public static final Advertise a = new Advertise();

        private Advertise() {
            super(0);
        }
    }

    public static final class Discover extends ConnectionType {
        public static final Discover a = new Discover();

        private Discover() {
            super(0);
        }
    }

    public /* synthetic */ ConnectionType(int i) {
        this();
    }

    private ConnectionType() {
    }
}
