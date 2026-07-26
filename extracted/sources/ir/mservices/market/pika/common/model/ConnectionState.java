package ir.mservices.market.pika.common.model;

import defpackage.js3;
import defpackage.q11;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectionState {

    public static final class Advertising extends ConnectionState {
        public static final Advertising INSTANCE = new Advertising();

        private Advertising() {
            super(null);
        }
    }

    public static final class Connected extends ConnectionState {
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }
    }

    public static final class ConnectionInitiatedState extends ConnectionState {
        private final String endPointId;
        private final q11 info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionInitiatedState(String str, q11 q11Var) {
            super(null);
            js3.p(str, "endPointId");
            js3.p(q11Var, "info");
            this.endPointId = str;
            this.info = q11Var;
        }

        public final String getEndPointId() {
            return this.endPointId;
        }

        public final q11 getInfo() {
            return this.info;
        }
    }

    public static final class Disconnect extends ConnectionState {
        public static final Disconnect INSTANCE = new Disconnect();

        private Disconnect() {
            super(null);
        }
    }

    public static final class Discovery extends ConnectionState {
        public static final Discovery INSTANCE = new Discovery();

        private Discovery() {
            super(null);
        }
    }

    public static final class EndPointFound extends ConnectionState {
        public static final EndPointFound INSTANCE = new EndPointFound();

        private EndPointFound() {
            super(null);
        }
    }

    public static final class Error extends ConnectionState {
        private final Exception e;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Exception getE() {
            return this.e;
        }

        public Error(Exception exc) {
            super(null);
            this.e = exc;
        }

        public /* synthetic */ Error(Exception exc, int i, yd1 yd1Var) {
            this((i & 1) != 0 ? null : exc);
        }
    }

    public static final class OwnDeviceUpdateRequire extends ConnectionState {
        public static final OwnDeviceUpdateRequire INSTANCE = new OwnDeviceUpdateRequire();

        private OwnDeviceUpdateRequire() {
            super(null);
        }
    }

    public static final class PairDeviceUpdateRequire extends ConnectionState {
        public static final PairDeviceUpdateRequire INSTANCE = new PairDeviceUpdateRequire();

        private PairDeviceUpdateRequire() {
            super(null);
        }
    }

    public /* synthetic */ ConnectionState(yd1 yd1Var) {
        this();
    }

    private ConnectionState() {
    }
}
