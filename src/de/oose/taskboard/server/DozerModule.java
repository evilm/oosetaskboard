package de.oose.taskboard.server;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.google.inject.AbstractModule;

import de.oose.taskboard.server.entity.PersistenceService;
import de.oose.taskboard.server.entity.PersistenceServiceImpl;

public class DozerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Mapper.class).to(DozerBeanMapper.class).asEagerSingleton();
		bind(PersistenceService.class).to(PersistenceServiceImpl.class);
	}

}
