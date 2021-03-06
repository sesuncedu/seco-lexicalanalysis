// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from connexor.proto

package fi.seco.lexical.connexor.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class CleanHTMLResponse implements Externalizable, Message<CleanHTMLResponse> {

	public static Schema<CleanHTMLResponse> getSchema() {
		return SCHEMA;
	}

	public static CleanHTMLResponse getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	static final CleanHTMLResponse DEFAULT_INSTANCE = new CleanHTMLResponse();

	// non-private fields
	// see http://developer.android.com/guide/practices/design/performance.html#package_inner
	String text;
	String error;

	public CleanHTMLResponse() {

	}

	// getters and setters

	// text

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	// error

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	// java serialization

	@Override
	public void readExternal(ObjectInput in) throws IOException {
		GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
	}

	// message method

	@Override
	public Schema<CleanHTMLResponse> cachedSchema() {
		return SCHEMA;
	}

	static final Schema<CleanHTMLResponse> SCHEMA = new Schema<CleanHTMLResponse>() {
		// schema methods

		@Override
		public CleanHTMLResponse newMessage() {
			return new CleanHTMLResponse();
		}

		@Override
		public Class<CleanHTMLResponse> typeClass() {
			return CleanHTMLResponse.class;
		}

		@Override
		public String messageName() {
			return CleanHTMLResponse.class.getSimpleName();
		}

		@Override
		public String messageFullName() {
			return CleanHTMLResponse.class.getName();
		}

		@Override
		public boolean isInitialized(CleanHTMLResponse message) {
			return true;
		}

		@Override
		public void mergeFrom(Input input, CleanHTMLResponse message) throws IOException {
			for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
				switch (number) {
				case 0:
					return;
				case 2:
					message.text = input.readString();
					break;
				case 255:
					message.error = input.readString();
					break;
				default:
					input.handleUnknownField(number, this);
				}
		}

		@Override
		public void writeTo(Output output, CleanHTMLResponse message) throws IOException {
			if (message.text != null) output.writeString(2, message.text, false);

			if (message.error != null) output.writeString(255, message.error, false);
		}

		@Override
		public String getFieldName(int number) {
			switch (number) {
			case 2:
				return "text";
			case 255:
				return "error";
			default:
				return null;
			}
		}

		@Override
		public int getFieldNumber(String name) {
			final Integer number = fieldMap.get(name);
			return number == null ? 0 : number.intValue();
		}

		final java.util.HashMap<String, Integer> fieldMap = new java.util.HashMap<String, Integer>();
		{
			fieldMap.put("text", 2);
			fieldMap.put("error", 255);
		}
	};

}
