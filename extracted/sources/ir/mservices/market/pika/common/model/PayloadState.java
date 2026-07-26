package ir.mservices.market.pika.common.model;

import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PayloadState {

    public static final class Canceled extends PayloadState {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    public static final class Failed extends PayloadState {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    public static final class InProgress extends PayloadState {
        private final long allData;
        private final long progress;
        private final long totalReceivedData;

        public InProgress(long j, long j2, long j3) {
            super(null);
            this.progress = j;
            this.totalReceivedData = j2;
            this.allData = j3;
        }

        public final long getAllData() {
            return this.allData;
        }

        public final long getProgress() {
            return this.progress;
        }

        public final long getTotalReceivedData() {
            return this.totalReceivedData;
        }
    }

    public static final class Received extends PayloadState {
        public static final Received INSTANCE = new Received();

        private Received() {
            super(null);
        }
    }

    public static final class Success extends PayloadState {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ PayloadState(yd1 yd1Var) {
        this();
    }

    private PayloadState() {
    }
}
