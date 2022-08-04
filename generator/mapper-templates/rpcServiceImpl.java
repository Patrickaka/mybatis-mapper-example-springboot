package ${package};

import ${project.attrs.basePackage}.rpcapi.Rpc${it.name.className}Service;
import ${project.attrs.basePackage}.model.${it.name.className};
import org.springframework.stereotype.Service;

/**
 * ${it.name} - ${it.comment}
 *
 * @author ${SYS['user.name']}
 */
@Service
public class Rpc${it.name.className}ServiceImpl implements Rpc${it.name.className}Service {

}
