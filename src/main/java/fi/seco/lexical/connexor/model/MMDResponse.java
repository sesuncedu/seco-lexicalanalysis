// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from connexor.proto

package fi.seco.lexical.connexor.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class MMDResponse implements Externalizable, Message<MMDResponse> {
	public static final class Entity implements Externalizable, Message<Entity> {
		public static final class Mention implements Externalizable, Message<Mention> {
			public static final class Occurrence implements Externalizable, Message<Occurrence> {

				public static Schema<Occurrence> getSchema() {
					return SCHEMA;
				}

				public static Occurrence getDefaultInstance() {
					return DEFAULT_INSTANCE;
				}

				static final Occurrence DEFAULT_INSTANCE = new Occurrence();

				// non-private fields
				// see http://developer.android.com/guide/practices/design/performance.html#package_inner
				String name;
				Integer position;
				Integer length;
				Integer sentencePosition;
				Integer sentenceLength;

				public Occurrence() {

				}

				// getters and setters

				// name

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				// position

				public Integer getPosition() {
					return position;
				}

				public void setPosition(Integer position) {
					this.position = position;
				}

				// length

				public Integer getLength() {
					return length;
				}

				public void setLength(Integer length) {
					this.length = length;
				}

				// sentencePosition

				public Integer getSentencePosition() {
					return sentencePosition;
				}

				public void setSentencePosition(Integer sentencePosition) {
					this.sentencePosition = sentencePosition;
				}

				// sentenceLength

				public Integer getSentenceLength() {
					return sentenceLength;
				}

				public void setSentenceLength(Integer sentenceLength) {
					this.sentenceLength = sentenceLength;
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
				public Schema<Occurrence> cachedSchema() {
					return SCHEMA;
				}

				static final Schema<Occurrence> SCHEMA = new Schema<Occurrence>() {
					// schema methods

					@Override
					public Occurrence newMessage() {
						return new Occurrence();
					}

					@Override
					public Class<Occurrence> typeClass() {
						return Occurrence.class;
					}

					@Override
					public String messageName() {
						return Occurrence.class.getSimpleName();
					}

					@Override
					public String messageFullName() {
						return Occurrence.class.getName();
					}

					@Override
					public boolean isInitialized(Occurrence message) {
						return true;
					}

					@Override
					public void mergeFrom(Input input, Occurrence message) throws IOException {
						for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
							switch (number) {
							case 0:
								return;
							case 1:
								message.name = input.readString();
								break;
							case 2:
								message.position = input.readInt32();
								break;
							case 3:
								message.length = input.readInt32();
								break;
							case 4:
								message.sentencePosition = input.readInt32();
								break;
							case 5:
								message.sentenceLength = input.readInt32();
								break;
							default:
								input.handleUnknownField(number, this);
							}
					}

					@Override
					public void writeTo(Output output, Occurrence message) throws IOException {
						if (message.name != null) output.writeString(1, message.name, false);

						if (message.position != null) output.writeInt32(2, message.position, false);

						if (message.length != null) output.writeInt32(3, message.length, false);

						if (message.sentencePosition != null) output.writeInt32(4, message.sentencePosition, false);

						if (message.sentenceLength != null) output.writeInt32(5, message.sentenceLength, false);
					}

					@Override
					public String getFieldName(int number) {
						switch (number) {
						case 1:
							return "name";
						case 2:
							return "position";
						case 3:
							return "length";
						case 4:
							return "sentencePosition";
						case 5:
							return "sentenceLength";
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
						fieldMap.put("name", 1);
						fieldMap.put("position", 2);
						fieldMap.put("length", 3);
						fieldMap.put("sentencePosition", 4);
						fieldMap.put("sentenceLength", 5);
					}
				};

			}

			public static Schema<Mention> getSchema() {
				return SCHEMA;
			}

			public static Mention getDefaultInstance() {
				return DEFAULT_INSTANCE;
			}

			static final Mention DEFAULT_INSTANCE = new Mention();

			// non-private fields
			// see http://developer.android.com/guide/practices/design/performance.html#package_inner
			String category;
			String name;
			Integer frequency;
			List<Occurrence> occurrence;

			public Mention() {

			}

			// getters and setters

			// category

			public String getCategory() {
				return category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			// name

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			// frequency

			public Integer getFrequency() {
				return frequency;
			}

			public void setFrequency(Integer frequency) {
				this.frequency = frequency;
			}

			// occurrence

			public List<Occurrence> getOccurrenceList() {
				return occurrence;
			}

			public void setOccurrenceList(List<Occurrence> occurrence) {
				this.occurrence = occurrence;
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
			public Schema<Mention> cachedSchema() {
				return SCHEMA;
			}

			static final Schema<Mention> SCHEMA = new Schema<Mention>() {
				// schema methods

				@Override
				public Mention newMessage() {
					return new Mention();
				}

				@Override
				public Class<Mention> typeClass() {
					return Mention.class;
				}

				@Override
				public String messageName() {
					return Mention.class.getSimpleName();
				}

				@Override
				public String messageFullName() {
					return Mention.class.getName();
				}

				@Override
				public boolean isInitialized(Mention message) {
					return true;
				}

				@Override
				public void mergeFrom(Input input, Mention message) throws IOException {
					for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
						switch (number) {
						case 0:
							return;
						case 1:
							message.category = input.readString();
							break;
						case 2:
							message.name = input.readString();
							break;
						case 3:
							message.frequency = input.readInt32();
							break;
						case 4:
							if (message.occurrence == null) message.occurrence = new ArrayList<Occurrence>();
							message.occurrence.add(input.mergeObject(null, Occurrence.getSchema()));
							break;

						default:
							input.handleUnknownField(number, this);
						}
				}

				@Override
				public void writeTo(Output output, Mention message) throws IOException {
					if (message.category != null) output.writeString(1, message.category, false);

					if (message.name != null) output.writeString(2, message.name, false);

					if (message.frequency != null) output.writeInt32(3, message.frequency, false);

					if (message.occurrence != null) for (Occurrence occurrence : message.occurrence)
						if (occurrence != null) output.writeObject(4, occurrence, Occurrence.getSchema(), true);

				}

				@Override
				public String getFieldName(int number) {
					switch (number) {
					case 1:
						return "category";
					case 2:
						return "name";
					case 3:
						return "frequency";
					case 4:
						return "occurrence";
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
					fieldMap.put("category", 1);
					fieldMap.put("name", 2);
					fieldMap.put("frequency", 3);
					fieldMap.put("occurrence", 4);
				}
			};

		}

		public static Schema<Entity> getSchema() {
			return SCHEMA;
		}

		public static Entity getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		static final Entity DEFAULT_INSTANCE = new Entity();

		// non-private fields
		// see http://developer.android.com/guide/practices/design/performance.html#package_inner
		String category;
		String name;
		Float weight;
		List<Mention> mention;

		public Entity() {

		}

		// getters and setters

		// category

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		// name

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// weight

		public Float getWeight() {
			return weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}

		// mention

		public List<Mention> getMentionList() {
			return mention;
		}

		public void setMentionList(List<Mention> mention) {
			this.mention = mention;
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
		public Schema<Entity> cachedSchema() {
			return SCHEMA;
		}

		static final Schema<Entity> SCHEMA = new Schema<Entity>() {
			// schema methods

			@Override
			public Entity newMessage() {
				return new Entity();
			}

			@Override
			public Class<Entity> typeClass() {
				return Entity.class;
			}

			@Override
			public String messageName() {
				return Entity.class.getSimpleName();
			}

			@Override
			public String messageFullName() {
				return Entity.class.getName();
			}

			@Override
			public boolean isInitialized(Entity message) {
				return true;
			}

			@Override
			public void mergeFrom(Input input, Entity message) throws IOException {
				for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
					switch (number) {
					case 0:
						return;
					case 1:
						message.category = input.readString();
						break;
					case 2:
						message.name = input.readString();
						break;
					case 3:
						message.weight = input.readFloat();
						break;
					case 4:
						if (message.mention == null) message.mention = new ArrayList<Mention>();
						message.mention.add(input.mergeObject(null, Mention.getSchema()));
						break;

					default:
						input.handleUnknownField(number, this);
					}
			}

			@Override
			public void writeTo(Output output, Entity message) throws IOException {
				if (message.category != null) output.writeString(1, message.category, false);

				if (message.name != null) output.writeString(2, message.name, false);

				if (message.weight != null) output.writeFloat(3, message.weight, false);

				if (message.mention != null) for (Mention mention : message.mention)
					if (mention != null) output.writeObject(4, mention, Mention.getSchema(), true);

			}

			@Override
			public String getFieldName(int number) {
				switch (number) {
				case 1:
					return "category";
				case 2:
					return "name";
				case 3:
					return "weight";
				case 4:
					return "mention";
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
				fieldMap.put("category", 1);
				fieldMap.put("name", 2);
				fieldMap.put("weight", 3);
				fieldMap.put("mention", 4);
			}
		};

	}

	public static Schema<MMDResponse> getSchema() {
		return SCHEMA;
	}

	public static MMDResponse getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	static final MMDResponse DEFAULT_INSTANCE = new MMDResponse();

	// non-private fields
	// see http://developer.android.com/guide/practices/design/performance.html#package_inner
	List<Entity> entity;
	String error;

	public MMDResponse() {

	}

	// getters and setters

	// entity

	public List<Entity> getEntityList() {
		return entity;
	}

	public void setEntityList(List<Entity> entity) {
		this.entity = entity;
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
	public Schema<MMDResponse> cachedSchema() {
		return SCHEMA;
	}

	static final Schema<MMDResponse> SCHEMA = new Schema<MMDResponse>() {
		// schema methods

		@Override
		public MMDResponse newMessage() {
			return new MMDResponse();
		}

		@Override
		public Class<MMDResponse> typeClass() {
			return MMDResponse.class;
		}

		@Override
		public String messageName() {
			return MMDResponse.class.getSimpleName();
		}

		@Override
		public String messageFullName() {
			return MMDResponse.class.getName();
		}

		@Override
		public boolean isInitialized(MMDResponse message) {
			return true;
		}

		@Override
		public void mergeFrom(Input input, MMDResponse message) throws IOException {
			for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
				switch (number) {
				case 0:
					return;
				case 2:
					if (message.entity == null) message.entity = new ArrayList<Entity>();
					message.entity.add(input.mergeObject(null, Entity.getSchema()));
					break;

				case 255:
					message.error = input.readString();
					break;
				default:
					input.handleUnknownField(number, this);
				}
		}

		@Override
		public void writeTo(Output output, MMDResponse message) throws IOException {
			if (message.entity != null) for (Entity entity : message.entity)
				if (entity != null) output.writeObject(2, entity, Entity.getSchema(), true);

			if (message.error != null) output.writeString(255, message.error, false);
		}

		@Override
		public String getFieldName(int number) {
			switch (number) {
			case 2:
				return "entity";
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
			fieldMap.put("entity", 2);
			fieldMap.put("error", 255);
		}
	};

}
