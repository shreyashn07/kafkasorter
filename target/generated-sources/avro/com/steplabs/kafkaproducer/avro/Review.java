/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.steplabs.kafkaproducer.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Review extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3699554495760320057L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Review\",\"namespace\":\"com.steplabs.kafkaproducer.avro\",\"fields\":[{\"name\":\"reviewId\",\"type\":\"string\"},{\"name\":\"comments\",\"type\":[\"string\",\"null\"],\"default\":null},{\"name\":\"starRating\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"modified\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"user\",\"type\":{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"reviewerLanguage\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"device\",\"type\":{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"manufacturer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"productName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ramMb\",\"type\":[\"null\",\"long\"],\"default\":null}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Review> ENCODER =
      new BinaryMessageEncoder<Review>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Review> DECODER =
      new BinaryMessageDecoder<Review>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Review> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Review> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Review>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Review to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Review from a ByteBuffer. */
  public static Review fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence reviewId;
  @Deprecated public java.lang.CharSequence comments;
  @Deprecated public java.lang.Long starRating;
  @Deprecated public java.lang.Long modified;
  @Deprecated public com.steplabs.kafkaproducer.avro.User user;
  @Deprecated public com.steplabs.kafkaproducer.avro.Device device;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Review() {}

  /**
   * All-args constructor.
   * @param reviewId The new value for reviewId
   * @param comments The new value for comments
   * @param starRating The new value for starRating
   * @param modified The new value for modified
   * @param user The new value for user
   * @param device The new value for device
   */
  public Review(java.lang.CharSequence reviewId, java.lang.CharSequence comments, java.lang.Long starRating, java.lang.Long modified, com.steplabs.kafkaproducer.avro.User user, com.steplabs.kafkaproducer.avro.Device device) {
    this.reviewId = reviewId;
    this.comments = comments;
    this.starRating = starRating;
    this.modified = modified;
    this.user = user;
    this.device = device;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reviewId;
    case 1: return comments;
    case 2: return starRating;
    case 3: return modified;
    case 4: return user;
    case 5: return device;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reviewId = (java.lang.CharSequence)value$; break;
    case 1: comments = (java.lang.CharSequence)value$; break;
    case 2: starRating = (java.lang.Long)value$; break;
    case 3: modified = (java.lang.Long)value$; break;
    case 4: user = (com.steplabs.kafkaproducer.avro.User)value$; break;
    case 5: device = (com.steplabs.kafkaproducer.avro.Device)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reviewId' field.
   * @return The value of the 'reviewId' field.
   */
  public java.lang.CharSequence getReviewId() {
    return reviewId;
  }

  /**
   * Sets the value of the 'reviewId' field.
   * @param value the value to set.
   */
  public void setReviewId(java.lang.CharSequence value) {
    this.reviewId = value;
  }

  /**
   * Gets the value of the 'comments' field.
   * @return The value of the 'comments' field.
   */
  public java.lang.CharSequence getComments() {
    return comments;
  }

  /**
   * Sets the value of the 'comments' field.
   * @param value the value to set.
   */
  public void setComments(java.lang.CharSequence value) {
    this.comments = value;
  }

  /**
   * Gets the value of the 'starRating' field.
   * @return The value of the 'starRating' field.
   */
  public java.lang.Long getStarRating() {
    return starRating;
  }

  /**
   * Sets the value of the 'starRating' field.
   * @param value the value to set.
   */
  public void setStarRating(java.lang.Long value) {
    this.starRating = value;
  }

  /**
   * Gets the value of the 'modified' field.
   * @return The value of the 'modified' field.
   */
  public java.lang.Long getModified() {
    return modified;
  }

  /**
   * Sets the value of the 'modified' field.
   * @param value the value to set.
   */
  public void setModified(java.lang.Long value) {
    this.modified = value;
  }

  /**
   * Gets the value of the 'user' field.
   * @return The value of the 'user' field.
   */
  public com.steplabs.kafkaproducer.avro.User getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(com.steplabs.kafkaproducer.avro.User value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'device' field.
   * @return The value of the 'device' field.
   */
  public com.steplabs.kafkaproducer.avro.Device getDevice() {
    return device;
  }

  /**
   * Sets the value of the 'device' field.
   * @param value the value to set.
   */
  public void setDevice(com.steplabs.kafkaproducer.avro.Device value) {
    this.device = value;
  }

  /**
   * Creates a new Review RecordBuilder.
   * @return A new Review RecordBuilder
   */
  public static com.steplabs.kafkaproducer.avro.Review.Builder newBuilder() {
    return new com.steplabs.kafkaproducer.avro.Review.Builder();
  }

  /**
   * Creates a new Review RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Review RecordBuilder
   */
  public static com.steplabs.kafkaproducer.avro.Review.Builder newBuilder(com.steplabs.kafkaproducer.avro.Review.Builder other) {
    return new com.steplabs.kafkaproducer.avro.Review.Builder(other);
  }

  /**
   * Creates a new Review RecordBuilder by copying an existing Review instance.
   * @param other The existing instance to copy.
   * @return A new Review RecordBuilder
   */
  public static com.steplabs.kafkaproducer.avro.Review.Builder newBuilder(com.steplabs.kafkaproducer.avro.Review other) {
    return new com.steplabs.kafkaproducer.avro.Review.Builder(other);
  }

  /**
   * RecordBuilder for Review instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Review>
    implements org.apache.avro.data.RecordBuilder<Review> {

    private java.lang.CharSequence reviewId;
    private java.lang.CharSequence comments;
    private java.lang.Long starRating;
    private java.lang.Long modified;
    private com.steplabs.kafkaproducer.avro.User user;
    private com.steplabs.kafkaproducer.avro.User.Builder userBuilder;
    private com.steplabs.kafkaproducer.avro.Device device;
    private com.steplabs.kafkaproducer.avro.Device.Builder deviceBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.steplabs.kafkaproducer.avro.Review.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reviewId)) {
        this.reviewId = data().deepCopy(fields()[0].schema(), other.reviewId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comments)) {
        this.comments = data().deepCopy(fields()[1].schema(), other.comments);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.starRating)) {
        this.starRating = data().deepCopy(fields()[2].schema(), other.starRating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.modified)) {
        this.modified = data().deepCopy(fields()[3].schema(), other.modified);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.user)) {
        this.user = data().deepCopy(fields()[4].schema(), other.user);
        fieldSetFlags()[4] = true;
      }
      if (other.hasUserBuilder()) {
        this.userBuilder = com.steplabs.kafkaproducer.avro.User.newBuilder(other.getUserBuilder());
      }
      if (isValidValue(fields()[5], other.device)) {
        this.device = data().deepCopy(fields()[5].schema(), other.device);
        fieldSetFlags()[5] = true;
      }
      if (other.hasDeviceBuilder()) {
        this.deviceBuilder = com.steplabs.kafkaproducer.avro.Device.newBuilder(other.getDeviceBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Review instance
     * @param other The existing instance to copy.
     */
    private Builder(com.steplabs.kafkaproducer.avro.Review other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.reviewId)) {
        this.reviewId = data().deepCopy(fields()[0].schema(), other.reviewId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comments)) {
        this.comments = data().deepCopy(fields()[1].schema(), other.comments);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.starRating)) {
        this.starRating = data().deepCopy(fields()[2].schema(), other.starRating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.modified)) {
        this.modified = data().deepCopy(fields()[3].schema(), other.modified);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.user)) {
        this.user = data().deepCopy(fields()[4].schema(), other.user);
        fieldSetFlags()[4] = true;
      }
      this.userBuilder = null;
      if (isValidValue(fields()[5], other.device)) {
        this.device = data().deepCopy(fields()[5].schema(), other.device);
        fieldSetFlags()[5] = true;
      }
      this.deviceBuilder = null;
    }

    /**
      * Gets the value of the 'reviewId' field.
      * @return The value.
      */
    public java.lang.CharSequence getReviewId() {
      return reviewId;
    }

    /**
      * Sets the value of the 'reviewId' field.
      * @param value The value of 'reviewId'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setReviewId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.reviewId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reviewId' field has been set.
      * @return True if the 'reviewId' field has been set, false otherwise.
      */
    public boolean hasReviewId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reviewId' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearReviewId() {
      reviewId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'comments' field.
      * @return The value.
      */
    public java.lang.CharSequence getComments() {
      return comments;
    }

    /**
      * Sets the value of the 'comments' field.
      * @param value The value of 'comments'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setComments(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.comments = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'comments' field has been set.
      * @return True if the 'comments' field has been set, false otherwise.
      */
    public boolean hasComments() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'comments' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearComments() {
      comments = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'starRating' field.
      * @return The value.
      */
    public java.lang.Long getStarRating() {
      return starRating;
    }

    /**
      * Sets the value of the 'starRating' field.
      * @param value The value of 'starRating'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setStarRating(java.lang.Long value) {
      validate(fields()[2], value);
      this.starRating = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'starRating' field has been set.
      * @return True if the 'starRating' field has been set, false otherwise.
      */
    public boolean hasStarRating() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'starRating' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearStarRating() {
      starRating = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'modified' field.
      * @return The value.
      */
    public java.lang.Long getModified() {
      return modified;
    }

    /**
      * Sets the value of the 'modified' field.
      * @param value The value of 'modified'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setModified(java.lang.Long value) {
      validate(fields()[3], value);
      this.modified = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'modified' field has been set.
      * @return True if the 'modified' field has been set, false otherwise.
      */
    public boolean hasModified() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'modified' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearModified() {
      modified = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'user' field.
      * @return The value.
      */
    public com.steplabs.kafkaproducer.avro.User getUser() {
      return user;
    }

    /**
      * Sets the value of the 'user' field.
      * @param value The value of 'user'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setUser(com.steplabs.kafkaproducer.avro.User value) {
      validate(fields()[4], value);
      this.userBuilder = null;
      this.user = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'user' field has been set.
      * @return True if the 'user' field has been set, false otherwise.
      */
    public boolean hasUser() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'user' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.steplabs.kafkaproducer.avro.User.Builder getUserBuilder() {
      if (userBuilder == null) {
        if (hasUser()) {
          setUserBuilder(com.steplabs.kafkaproducer.avro.User.newBuilder(user));
        } else {
          setUserBuilder(com.steplabs.kafkaproducer.avro.User.newBuilder());
        }
      }
      return userBuilder;
    }

    /**
     * Sets the Builder instance for the 'user' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.steplabs.kafkaproducer.avro.Review.Builder setUserBuilder(com.steplabs.kafkaproducer.avro.User.Builder value) {
      clearUser();
      userBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'user' field has an active Builder instance
     * @return True if the 'user' field has an active Builder instance
     */
    public boolean hasUserBuilder() {
      return userBuilder != null;
    }

    /**
      * Clears the value of the 'user' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearUser() {
      user = null;
      userBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'device' field.
      * @return The value.
      */
    public com.steplabs.kafkaproducer.avro.Device getDevice() {
      return device;
    }

    /**
      * Sets the value of the 'device' field.
      * @param value The value of 'device'.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder setDevice(com.steplabs.kafkaproducer.avro.Device value) {
      validate(fields()[5], value);
      this.deviceBuilder = null;
      this.device = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'device' field has been set.
      * @return True if the 'device' field has been set, false otherwise.
      */
    public boolean hasDevice() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'device' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.steplabs.kafkaproducer.avro.Device.Builder getDeviceBuilder() {
      if (deviceBuilder == null) {
        if (hasDevice()) {
          setDeviceBuilder(com.steplabs.kafkaproducer.avro.Device.newBuilder(device));
        } else {
          setDeviceBuilder(com.steplabs.kafkaproducer.avro.Device.newBuilder());
        }
      }
      return deviceBuilder;
    }

    /**
     * Sets the Builder instance for the 'device' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.steplabs.kafkaproducer.avro.Review.Builder setDeviceBuilder(com.steplabs.kafkaproducer.avro.Device.Builder value) {
      clearDevice();
      deviceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'device' field has an active Builder instance
     * @return True if the 'device' field has an active Builder instance
     */
    public boolean hasDeviceBuilder() {
      return deviceBuilder != null;
    }

    /**
      * Clears the value of the 'device' field.
      * @return This builder.
      */
    public com.steplabs.kafkaproducer.avro.Review.Builder clearDevice() {
      device = null;
      deviceBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Review build() {
      try {
        Review record = new Review();
        record.reviewId = fieldSetFlags()[0] ? this.reviewId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.comments = fieldSetFlags()[1] ? this.comments : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.starRating = fieldSetFlags()[2] ? this.starRating : (java.lang.Long) defaultValue(fields()[2]);
        record.modified = fieldSetFlags()[3] ? this.modified : (java.lang.Long) defaultValue(fields()[3]);
        if (userBuilder != null) {
          record.user = this.userBuilder.build();
        } else {
          record.user = fieldSetFlags()[4] ? this.user : (com.steplabs.kafkaproducer.avro.User) defaultValue(fields()[4]);
        }
        if (deviceBuilder != null) {
          record.device = this.deviceBuilder.build();
        } else {
          record.device = fieldSetFlags()[5] ? this.device : (com.steplabs.kafkaproducer.avro.Device) defaultValue(fields()[5]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Review>
    WRITER$ = (org.apache.avro.io.DatumWriter<Review>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Review>
    READER$ = (org.apache.avro.io.DatumReader<Review>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
