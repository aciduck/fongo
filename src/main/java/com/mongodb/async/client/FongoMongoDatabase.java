/**
 * Copyright (C) 2016 Deveryware S.A. All Rights Reserved.
 */
package com.mongodb.async.client;

import com.github.fakemongo.async.FongoAsync;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import org.bson.codecs.configuration.CodecRegistry;

/**
 *
 */
public class FongoMongoDatabase extends MongoDatabaseImpl {
  private final FongoAsync fongoAsync;

  public FongoMongoDatabase(String name, CodecRegistry codecRegistry, ReadPreference readPreference, WriteConcern writeConcern, ReadConcern readConcern, FongoAsync fongoAsync) {
    super(name, codecRegistry, readPreference, writeConcern, readConcern, fongoAsync);
    this.fongoAsync = fongoAsync;
  }
}
