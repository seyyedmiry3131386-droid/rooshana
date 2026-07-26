package ir.mservices.market.common.comment.data;

import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CommentResultState {

    public static final class Cancel extends CommentResultState {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public int hashCode() {
            return 849125111;
        }

        public String toString() {
            return "Cancel";
        }
    }

    public static final class Error extends CommentResultState {
        private final ErrorDTO errorDto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorDTO errorDTO) {
            super(null);
            js3.p(errorDTO, "errorDto");
            this.errorDto = errorDTO;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorDTO errorDTO, int i, Object obj) {
            if ((i & 1) != 0) {
                errorDTO = error.errorDto;
            }
            return error.copy(errorDTO);
        }

        public final ErrorDTO component1() {
            return this.errorDto;
        }

        public final Error copy(ErrorDTO errorDTO) {
            js3.p(errorDTO, "errorDto");
            return new Error(errorDTO);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && js3.i(this.errorDto, ((Error) obj).errorDto);
        }

        public final ErrorDTO getErrorDto() {
            return this.errorDto;
        }

        public int hashCode() {
            return this.errorDto.hashCode();
        }

        public String toString() {
            return "Error(errorDto=" + this.errorDto + ")";
        }
    }

    public static final class Success extends CommentResultState {
        private final ReviewResultDto data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ReviewResultDto reviewResultDto) {
            super(null);
            js3.p(reviewResultDto, "data");
            this.data = reviewResultDto;
        }

        public static /* synthetic */ Success copy$default(Success success, ReviewResultDto reviewResultDto, int i, Object obj) {
            if ((i & 1) != 0) {
                reviewResultDto = success.data;
            }
            return success.copy(reviewResultDto);
        }

        public final ReviewResultDto component1() {
            return this.data;
        }

        public final Success copy(ReviewResultDto reviewResultDto) {
            js3.p(reviewResultDto, "data");
            return new Success(reviewResultDto);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && js3.i(this.data, ((Success) obj).data);
        }

        public final ReviewResultDto getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    public /* synthetic */ CommentResultState(yd1 yd1Var) {
        this();
    }

    private CommentResultState() {
    }
}
