package ir.mservices.market.movie.streamers;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface StreamerProfileListAction extends r50 {

    public static final class FollowStreamerAction implements StreamerProfileListAction {
        public static final FollowStreamerAction INSTANCE = new FollowStreamerAction();

        private FollowStreamerAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FollowStreamerAction);
        }

        public int hashCode() {
            return -916754622;
        }

        public String toString() {
            return "FollowStreamerAction";
        }
    }

    public static final class UnFollowStreamerAction implements StreamerProfileListAction {
        public static final UnFollowStreamerAction INSTANCE = new UnFollowStreamerAction();

        private UnFollowStreamerAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnFollowStreamerAction);
        }

        public int hashCode() {
            return -742258693;
        }

        public String toString() {
            return "UnFollowStreamerAction";
        }
    }
}
